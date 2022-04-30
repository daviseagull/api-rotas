package com.lab.engenharia.apirotas.mapper;

import com.lab.engenharia.apirotas.entity.Customer;
import com.lab.engenharia.apirotas.model.CustomerDto;
import com.lab.engenharia.apirotas.model.CustomerSummaryDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDto toCustomerDto(Customer customer);

    CustomerSummaryDto toCustomerSummaryDto(Customer customer);

    Customer toCustomer(CustomerDto vehicleDto);
}
