package com.cg.tms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import com.cg.tms.dto.TraineeBean;
import com.cg.tms.exception.TraineeException;

@Repository
public class TraineeDaoImpl implements ITraineeDao {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void addTrainee(TraineeBean tb) throws TraineeException {
		
		System.out.println(tb);
		manager.persist(tb);
	}

	@Override
	public TraineeBean deleteTrainee(int traineeId) throws TraineeException {
		TraineeBean trainBean = manager.find(TraineeBean.class,traineeId);
		manager.remove(trainBean);
		return trainBean;
	}


	@Override
	public TraineeBean retrieveTrainee(int traineeId) throws TraineeException {
		// TODO Auto-generated method stub
		return manager.find(TraineeBean.class,traineeId);
	}

	@Override
	public List<TraineeBean> retrieveAllTrainee() throws TraineeException {
		String strQry = "SELECT tr FROM TraineeBean tr";
		TypedQuery<TraineeBean> qry = manager.createQuery(strQry,TraineeBean.class);
		List<TraineeBean> traineeList = qry.getResultList();
		return traineeList;
	}

	@Override
	public void modifyTrainee(TraineeBean tb) throws TraineeException {
		
		manager.merge(tb);
		
	}

}
