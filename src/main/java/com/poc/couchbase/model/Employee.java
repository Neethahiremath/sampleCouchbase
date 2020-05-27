package com.poc.couchbase.model;

import com.couchbase.client.java.repository.annotation.Field;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Document
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Employee {

  @NotNull @Id private String id;

  @NotNull @Field private String name;

  @NotNull @Field private String companyName;

}
