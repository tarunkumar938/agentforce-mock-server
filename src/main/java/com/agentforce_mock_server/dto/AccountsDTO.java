package com.agentforce_mock_server.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AccountsDTO {
  String companyId;
  String companyBusinessName;
  String website;
  String sector;
  String industry;
  String phoneNumber;
  String address;
}
