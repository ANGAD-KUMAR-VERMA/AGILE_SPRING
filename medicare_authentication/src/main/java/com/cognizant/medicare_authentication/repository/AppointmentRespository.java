package com.cognizant.medicare_authentication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognizant.medicare_authentication.model.Agent;
import com.cognizant.medicare_authentication.model.Appointment;
import com.cognizant.medicare_authentication.model.Doctor;
import com.cognizant.medicare_authentication.model.Patient;

@Repository
public interface AppointmentRespository extends JpaRepository<Appointment, Long>{
      public List<Appointment> findByPatient(Patient patient);
      
      public List<Appointment> findByAgent(Agent agent);
      public List<Appointment> findByDoctorId(long doctorId);
      
     
      
          @Query(value = "select * from appointment where ap_dr_id=:dr_id", nativeQuery = true)
  	     List<Appointment> getAllAppointmentsForDoctor(@Param("dr_id") long doctorId); 
         
}
