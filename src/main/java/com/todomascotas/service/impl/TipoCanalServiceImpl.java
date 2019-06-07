package com.todomascotas.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.todomascotas.entity.TipoCanal;
import com.todomascotas.repository.TipoCanalRepository;
import com.todomascotas.service.TipoCanalService;
@Service
public class TipoCanalServiceImpl implements TipoCanalService {
	@Autowired
	private TipoCanalRepository tipocanalrepository;
	@Transactional(readOnly=true)
	public List<TipoCanal> findAll() throws Exception {
		// TODO Auto-generated method stub
		return tipocanalrepository.findAll();
	}
	@Transactional
	public TipoCanal save(TipoCanal t) throws Exception {
		// TODO Auto-generated method stub
		return tipocanalrepository.save(t);
	}
	@Transactional
	public TipoCanal update(TipoCanal t) throws Exception {
		// TODO Auto-generated method stub
		return tipocanalrepository.save(t);
	}
	@Transactional(readOnly=true)
	public Optional<TipoCanal> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return tipocanalrepository.findById(id);
	}
	@Transactional
	public void deleteById(Integer id) throws Exception {
		tipocanalrepository.deleteById(id);
		
	}
	@Transactional
	public void deleteAll() throws Exception {
		tipocanalrepository.deleteAll();
		
	}

}
