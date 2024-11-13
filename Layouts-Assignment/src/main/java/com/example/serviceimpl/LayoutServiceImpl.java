package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Layout;
import com.example.repo.LayoutRepository;
import com.example.service.LayoutService;

@Service
public class LayoutServiceImpl implements LayoutService {
	@Autowired
	private LayoutRepository layoutRepository;

	@Override
	public List<Layout> getAllLayouts() {

		return layoutRepository.findAll();
	}
}