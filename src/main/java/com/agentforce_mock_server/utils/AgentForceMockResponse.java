package com.agentforce_mock_server.utils;

import lombok.RequiredArgsConstructor;

import java.util.List;


@RequiredArgsConstructor
public class AgentForceMockResponse {

    public static final List<List<String>> technologyFiltersData =
            List.of(
                    List.of("Business Services", "Managed Services", "Key Horizontal BPO", "Key Horizontal BPO"),
                    List.of("Hardware", "Devices", "Mobile Phone", "Smartphone"),
                    List.of("Software", "Application Development & Deployment", "Analytics and Business Intelligence Software", "Business Intelligence Software")
            );

    public static final List<List<String>> geographyFilterData =
            List.of(
                    List.of("USA", "USA"),
                    List.of("APeJC", "India"),
                    List.of("Western Europe", "Austria")
            );

    public static final List<List<String>> industryFilterData =
            List.of(
                    List.of("Infrastructure", "Telecommunications"),
                    List.of("Public Sector", "Healthcare Provider"),
                    List.of("Distribution and Services", "Media"),
                    List.of("Manufacturing and Resources", "Discrete Manufacturing")
            );

    public static final List<List<String>> accountsData =
            List.of(
                    List.of("24795430", "AT&T", "att.com", "Telecommunications", "Wireless Communication", "+1-800-288-2020", "208 S. Akard Street, Dallas, TX 75202, USA", "Texas, USA"),
                    List.of("24812273", "Verizon Communications", "verizon.com", "Telecommunications", "Wireless Communication", "+1-800-837-4966", "1095 Avenue of the Americas, New York, NY 10036, USA", "New York, USA")
            );
}
