package com.todomascotas.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.todomascotas.entity.Canal;
import com.todomascotas.repository.CanalRepository;
import com.todomascotas.service.CanalService;

@Service
public class CanalServiceImpl implements CanalService {
@Autowired
private CanalRepository canalrepository;
@Transactional(readOnly=true)
	public List<Canal> findAll() throws Exception {
		// TODO Auto-generated method stub
		return canalrepository.findAll();
	}
@Transactional
	public Canal save(Canal t) throws Exception {
		// TODO Auto-generated method stub
		return canalrepository.save(t);
		}
@Transactional
	public Canal update(Canal t) throws Exception {
		// TODO Auto-generated method stub
		return canalrepository.save(t);
	}
	@Transactional(readOnly=true)
	public Optional<Canal> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return canalrepository.findById(id);
	}
	@Transactional
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		canalrepository.deleteById(id);
	}
	@Transactional
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		canalrepository.deleteAll();
	}

}
