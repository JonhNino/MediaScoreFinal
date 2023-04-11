package com.mediascorefinal.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mediascorefinal.app.Entity.Equipo;

public interface EquipoRepository extends MongoRepository<Equipo, String> { }
