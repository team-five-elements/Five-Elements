package co.com.mintic.proyecto4.cartera.services;

import co.com.mintic.proyecto4.cartera.entities.EnterpriseEntity;

import java.util.List;

public interface IEnterpriseService {
    public EnterpriseEntity findById(int id);

    public List<EnterpriseEntity> findAll();

    public EnterpriseEntity createEnterprise(EnterpriseEntity enterprise);

    public EnterpriseEntity updateEnterprise(EnterpriseEntity enterprise);

    public void deleteEnterprise(long id);
}
