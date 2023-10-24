package com.rihab.excursions.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rihab.excursions.entities.Excursion;
import com.rihab.excursions.entities.Type;
import com.rihab.excursions.repos.ExcursionRepository;
@Service
public class ExcursionServiceImpl implements ExcursionService {
@Autowired
ExcursionRepository excursionRepository;
@Override
public Excursion saveExcursion(Excursion e) {
	
	return excursionRepository.save(e);
	}
	@Override
	public Excursion updateExcursion(Excursion e) {
	return excursionRepository.save(e);
	}
	@Override
	public void deleteExcursion(Excursion e) {
		excursionRepository.delete(e);
	}
	 @Override
	public void deleteExcursionById(Long id) {
		 excursionRepository.deleteById(id);
	}
	@Override
	public Excursion getExcursion(Long id) {
	return excursionRepository.findById(id).get();
	}
	@Override
	public List<Excursion> getAllExcursions() {
	return excursionRepository.findAll();
	}
	
	
	@Override
	public List<Excursion> findByDistinationExcursion(String distination) {
	return excursionRepository.findByDistinationExcursion(distination);
	}
	@Override
	public List<Excursion> findByDistinationExcursionContains(String distination) {
	return excursionRepository.findByDistinationExcursionContains(distination);
	}
	@Override
	public List<Excursion> findByDistinationPrix(String distination, Double prix) {
	return excursionRepository.findByNomPrix(distination, prix);
	}
	@Override
	public List<Excursion> findByType(Type type) {
	return excursionRepository.findByType(type);
	}
	@Override
	public List<Excursion> findByTypeIdType(Long id) {
	return excursionRepository.findByTypeIdType(id);
	}
	@Override
	public List<Excursion> findByOrderByDistinationExcursionAsc() {
	return excursionRepository.findByOrderByDistinationExcursionAsc();
	}
	@Override
	public List<Excursion> trierExcursionsDistinationsPrix() {
	return excursionRepository.trierExcursionsDistinationsPrix();
	}
	
	
	
}