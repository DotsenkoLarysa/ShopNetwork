package com.itstep.dos.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import javax.persistence.spi.PersistenceUnitInfo;
import javax.persistence.spi.ProviderUtil;
import java.util.Map;

public class HibernatePersistence implements PersistenceProvider {
    @Override
    public EntityManagerFactory createEntityManagerFactory(String emName, Map map) {
        return null;
    }

    @Override
    public EntityManagerFactory createContainerEntityManagerFactory(PersistenceUnitInfo info, Map map) {
        return null;
    }

    @Override
    public void generateSchema(PersistenceUnitInfo info, Map map) {

    }

    @Override
    public boolean generateSchema(String persistenceUnitName, Map map) {
        return false;
    }

    @Override
    public ProviderUtil getProviderUtil() {
        return null;
    }
}
