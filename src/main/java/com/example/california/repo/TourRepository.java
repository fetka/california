package com.example.california.repo;

import com.example.california.domain.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;


/**
 * Tour Repository Interface
 *
 * Created by Mary Ellen Bowman
 */
public interface TourRepository extends PagingAndSortingRepository<Tour, Integer> {
    /**
     * Find Tours associated with the Tour Package.
     *
     * @param code tour package code
     * @return List of found tours.
     */
    Page<Tour> findByTourPackageCode(@Param("code")String code, Pageable pageable);

    @RestResource(exported = false)
    <S extends Tour> S save(S s);

    @RestResource(exported = false)
    <S extends Tour> Iterable<S> saveAll(Iterable<S> iterable);

    @RestResource(exported = false)
    void deleteById(Integer integer);

    @RestResource(exported = false)
    void delete(Tour tour);

    @RestResource(exported = false)
    void deleteAll(Iterable<? extends Tour> iterable);

    @RestResource(exported = false)
    void deleteAll();

    @RestResource(exported = false)
    long count();

    @RestResource(exported = true)
    Optional<Object> findById(int tourId);
}
