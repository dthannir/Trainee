package com.cg.tms.services;

import java.util.List;

import com.cg.tms.dto.TraineeBean;
import com.cg.tms.exception.TraineeException;

public interface ITraineeService {
	
	public void addTrainee(TraineeBean tb) throws TraineeException;
	public TraineeBean deleteTrainee(int traineeId) throws TraineeException;
	public TraineeBean retrieveTrainee(int traineeId) throws TraineeException;
	public List<TraineeBean> retrieveAllTrainee() throws TraineeException;
	public void modifyTrainee(TraineeBean tb) throws TraineeException;


}
