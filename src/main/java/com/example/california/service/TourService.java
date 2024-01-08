package com.example.california.service;

import com.example.california.domain.Tour;
import com.example.california.domain.TourPackage;
import com.example.california.repo.TourPackageRepository;
import com.example.california.repo.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * Tour  Service
 *
 * Created by Mary Ellen Bowman
 */
@Service
public class TourService {
    private TourRepository tourRepository;
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourService(TourRepository tourRepository, TourPackageRepository tourPackageRepository) {
        this.tourRepository = tourRepository;
        this.tourPackageRepository = tourPackageRepository;
    }

    /**
     * Create a new Tour Object and persist it to the Database
     *
     * @param title Title of the tour
     * @param tourPackageName tour Package of the tour
     * @param details Extra details about the tour
     * @return Tour
     */
    public Tour createTour(String title,  String tourPackageName, Map<String,String> details ) {
        TourPackage tourPackage = tourPackageRepository.findByName(tourPackageName).orElseThrow(()->
             new RuntimeException("Tour package does not exist: " + tourPackageName));

        return tourRepository.save(new Tour(title, tourPackage, details));
    }


}

