package com.db.TreeDemo;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GovernanceController {

	@Autowired
	private GovernanceRepository repository;

	@GetMapping("data")
	public Map<String, Map<String, List<Governance>>> getTreeData() {
		return getGroupBy(new HashSet<>(this.repository.findAll()));
	}

	@GetMapping("dataview")
	public List<Governance> getTreeViewData(@RequestParam("level1") String level1,
			@RequestParam("level2") String level2) {
		return getGroupBy(new HashSet<>(this.repository.findAll())).get(level1).get(level2);
	}
	
	private static Map<String, Map<String, List<Governance>>> getGroupBy(Set<Governance> data) {
		return data.stream().collect(Collectors.groupingBy(Governance::getLevel1, LinkedHashMap::new,
				Collectors.groupingBy(Governance::getLevel2, LinkedHashMap::new, Collectors.toList())));
	}

}
