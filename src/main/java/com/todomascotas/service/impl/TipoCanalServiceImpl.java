package com.todomascotas.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todomascotas.entity.TipoCanal;
import com.todomascotas.repository.TipoCanalRepository;
import com.todomascotas.service.TipoCanalService;
@Service
public class TipoCanalServiceImpl implements TipoCanalService {
	@Autowired
	private TipoCanalRepository tipocanalrepository;
	public List<TipoCanal> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public TipoCanal save(TipoCanal t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public TipoCanal update(TipoCanal t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<TipoCanal> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
