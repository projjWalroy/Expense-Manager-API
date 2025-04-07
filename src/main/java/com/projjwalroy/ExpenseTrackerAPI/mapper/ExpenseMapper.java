package com.projjwalroy.ExpenseTrackerAPI.mapper;

import com.projjwalroy.ExpenseTrackerAPI.dto.ExpenseDTO;
import com.projjwalroy.ExpenseTrackerAPI.entity.Expense;
import com.projjwalroy.ExpenseTrackerAPI.io.ExpenseRequest;
import com.projjwalroy.ExpenseTrackerAPI.io.ExpenseResponse;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ExpenseMapper {

    ExpenseMapper INSTANCE = Mappers.getMapper( ExpenseMapper.class );

    @Mapping(target = "category", source = "expenseDTO.categoryDTO")
    ExpenseResponse mapToExpenseResponse(ExpenseDTO expenseDTO);

    ExpenseDTO mapToExpenseDTO(ExpenseRequest request);

    Expense mapToExpenseEntity(ExpenseDTO expenseDTO);

    @Mapping(target = "categoryDTO", source = "expense.category")
    ExpenseDTO mapToExpenseDTO(Expense expense);
}