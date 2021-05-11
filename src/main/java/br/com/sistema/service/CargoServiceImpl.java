package br.com.sistema.service;

import br.com.sistema.model.Cargo;
import br.com.sistema.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoServiceImpl implements CargoService {

    @Autowired
    CargoRepository cargoRepository;

    @Override
    public Cargo findById(Long id) {
        return cargoRepository.findById(id).get();
    }

    @Override
    public Cargo findByNome(String nome) {
        return cargoRepository.findByNome(nome);
    }

    @Override
    public List<Cargo> findAll() {
        return cargoRepository.findAll();
    }

    @Override
    public String save(Cargo cargo) {
        return null;
    }

    @Override
    public String deleteById() {
        return null;
    }
}