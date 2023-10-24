package com.rihab.excursions.service;
import java.util.List;
import com.rihab.excursions.entities.Excursion;
import com.rihab.excursions.entities.Type;
public interface ExcursionService {
	Excursion saveExcursion(Excursion e);
Excursion updateExcursion(Excursion e);
void deleteExcursion(Excursion e);
 void deleteExcursionById(Long id);
 Excursion getExcursion(Long id);
List<Excursion> getAllExcursions();

List<Excursion> findByDistinationExcursion(String nom);
List<Excursion> findByDistinationExcursionContains(String nom);
List<Excursion> findByDistinationPrix (String nom, Double prix);
List<Excursion> findByType (Type type);
List<Excursion> findByTypeIdType(Long id);
List<Excursion> findByOrderByDistinationExcursionAsc();
List<Excursion> trierExcursionsDistinationsPrix();
}


