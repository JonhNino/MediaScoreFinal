package com.mediascorefinal.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mediascorefinal.app.Entity.Grupo;

public interface GrupoRepository extends MongoRepository<Grupo, String> {
}
