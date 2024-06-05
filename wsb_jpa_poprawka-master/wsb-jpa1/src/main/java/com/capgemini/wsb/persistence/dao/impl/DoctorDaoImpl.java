package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.DoctorDao;
import com.capgemini.wsb.persistence.entity.DoctorEntity;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.enums.Specialization;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



import java.util.ArrayList;
import java.util.List;

@Repository
public class DoctorDaoImpl extends AbstractDao<DoctorEntity, Long> implements DoctorDao {



    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<DoctorEntity> findBySpecialization(Specialization specialization) { // TODO - napisac query
        return entityManager.createQuery(
                        "SELECT d FROM DoctorEntity d WHERE d.specialization = :specialization", DoctorEntity.class)
                .setParameter("specialization", specialization)
                .getResultList();

    }

    @Override
    public long countNumOfVisitsWithPatient(String docFirstName, String docLastName, String patientFirstName, String patientLastName) { // TODO - napisac query
        return 3;
    }
}
