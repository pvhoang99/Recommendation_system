package com.example.neo4j_learning.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(value = "Person")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity {

  @Id
  @GeneratedValue
  private Long id;
  private String name;
}
