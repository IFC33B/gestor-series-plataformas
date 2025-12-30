package ifc33b.dwesc.gestor_series_plataformes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ifc33b.dwesc.gestor_series_plataformes.model.Serie;

public interface SerieRepository extends JpaRepository<Serie, Long> {
    List<Serie> findByPlataformaId(Long plataformaId);
}
