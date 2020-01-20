package com.dz.student.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Getter
@Setter
public class IdentityModel implements Serializable {

   @Id
   private String id;
   private long createdAt;
   private long updatedAt;
   private boolean delete = false;
   
}
