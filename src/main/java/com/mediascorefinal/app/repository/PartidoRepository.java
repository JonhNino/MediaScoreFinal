package com.mediascorefinal.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mediascorefinal.app.Entity.Partido;

public interface PartidoRepository extends MongoRepository<Partido, String> {
}
