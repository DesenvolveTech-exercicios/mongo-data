package com.desenvolve.noSQL.models;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Document(collection = "customers")
public class Customer {
    @Id
    public String id;
    @NonNull
    public String firstName;
    @NonNull
    public String lastName;
}