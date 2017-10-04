package com.cg.tms.services;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cg.tms.dao.ITraineeDao;
import com.cg.tms.dto.TraineeBean;
import com.cg.tms.exception.TraineeException;

@Service
@Transactional
public class TraineeServiceImpl implements ITraineeService {
	
	@Resource
	private ITraineeDao dao;

	@Override
	public void addTrainee(TraineeBean tb) throws TraineeException {
		dao.addTrainee(tb);

	}

	@Override
	public TraineeBean deleteTrainee(int traineeId) throws TraineeException {
		 return dao.deleteTrainee(traineeId);
		
	}

	@Override
	public TraineeBean retrieveTrainee(int traineeId) throws TraineeException {
		// TODO Auto-generated method stub
		return dao.retrieveTrainee(traineeId);
	}

	@Override
	public List<TraineeBean> retrieveAllTrainee() throws TraineeException {
		// TODO Auto-generated method stub
		return dao.retrieveAllTrainee();
	}

	@Override
	public void modifyTrainee(TraineeBean tb) throws TraineeException {
		dao.modifyTrainee(tb);
		
	}

}
