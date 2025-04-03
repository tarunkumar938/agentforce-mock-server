package com.agentforce_mock_server.utils;

import lombok.RequiredArgsConstructor;

import java.util.List;


@RequiredArgsConstructor
public class AgentForceMockResponse {

    public static final List<List<String>> technologyFiltersData =
            List.of(
                    List.of("Software", "Collaboration Tools", "Unified Communications", "Video Conferencing"),
                    List.of("Software", "E-Commerce", "Online Marketplace", "Retail Management Software"),
                    List.of("Software", "Customer Relationship Management", "CRM Software", "Sales Automation"),
                    List.of("Telecommunications", "5G Networks", "Wireless Infrastructure", "5G Towers"),
                    List.of("Business Services", "Logistics", "Supply Chain Management", "Inventory Tracking"),
                    List.of("Energy", "Renewable Energy", "Solar Power", "Solar Panel Technology"),
                    List.of("Finance", "Blockchain", "Cryptocurrency", "Decentralized Finance (DeFi)"),
                    List.of("Healthcare", "MedTech", "Electronic Health Records", "Telemedicine Platforms"),
                    List.of("Retail", "Point of Sale", "POS Systems", "Mobile Payment Solutions"),
                    List.of("Automotive", "Electric Vehicles", "EV Batteries", "Autonomous Driving Systems"),
                    List.of("Manufacturing", "Industrial IoT", "Smart Factory", "Predictive Maintenance")
            );

    public static final List<List<String>> geographyFilterData =
            List.of(
                    List.of("USA", "USA"),
                    List.of("APeJC", "India"),
                    List.of("Western Europe", "Austria"),
                    List.of("North America", "Canada"),
                    List.of("Latin America", "Brazil"),
                    List.of("Western Europe", "Germany"),
                    List.of("Western Europe", "France"),
                    List.of("APeJC", "Japan"),
                    List.of("APeJC", "China"),
                    List.of("APeJC", "South Korea"),
                    List.of("Middle East", "United Arab Emirates"),
                    List.of("Africa", "South Africa"),
                    List.of("Eastern Europe", "Poland")
            );


    public static final List<List<String>> industryFilterData =
            List.of(
                    List.of("Automotive", "Electric Vehicles"),
                    List.of("Consumer Goods", "Food & Beverage"),
                    List.of("Education", "E-Learning"),
                    List.of("Hospitality", "Hotels & Resorts"),
                    List.of("Infrastructure", "Telecommunications"),
                    List.of("Public Sector", "Healthcare Provider"),
                    List.of("Distribution and Services", "Media"),
                    List.of("Manufacturing and Resources", "Discrete Manufacturing"),
                    List.of("Finance", "Banking"),
                    List.of("Finance", "Insurance")
            );

    public static final List<List<String>> accountsData =
            List.of(
                    List.of("345678", "T-Mobile", "t-mobile.com", "Telecommunications", "Wireless Communication", "+1-877-453-1304", "12920 SE 38th Street, Bellevue, WA 98006, USA", "Washington, USA"),
                    List.of("456789", "Sprint", "sprint.com", "Telecommunications", "Wireless Communication", "+1-888-211-4727", "6200 Sprint Parkway, Overland Park, KS 66251, USA", "Kansas, USA"),
                    List.of("567890", "Comcast", "comcast.com", "Telecommunications", "Cable & Internet", "+1-800-266-2278", "One Comcast Center, Philadelphia, PA 19103, USA", "Pennsylvania, USA"),
                    List.of("678901", "Cisco Systems", "cisco.com", "Technology", "Networking", "+1-800-553-6387", "170 West Tasman Drive, San Jose, CA 95134, USA", "California, USA"),
                    List.of("789012", "Intel Corporation", "intel.com", "Technology", "Semiconductors", "+1-408-765-8080", "2200 Mission College Blvd, Santa Clara, CA 95054, USA", "California, USA"),
                    List.of("890123", "Oracle Corporation", "oracle.com", "Technology", "Software", "+1-800-633-0738", "500 Oracle Parkway, Redwood Shores, CA 94065, USA", "California, USA"),
                    List.of("901234", "IBM", "ibm.com", "Technology", "Enterprise IT", "+1-914-499-1900", "1 New Orchard Road, Armonk, NY 10504, USA", "New York, USA"),
                    List.of("012345", "Microsoft", "microsoft.com", "Technology", "Software", "+1-425-882-8080", "One Microsoft Way, Redmond, WA 98052, USA", "Washington, USA"),
                    List.of("112233", "Google", "google.com", "Technology", "Internet Services", "+1-650-253-0000", "1600 Amphitheatre Parkway, Mountain View, CA 94043, USA", "California, USA"),
                    List.of("223344", "Amazon", "amazon.com", "Retail & Technology", "E-Commerce", "+1-206-266-1000", "410 Terry Ave N, Seattle, WA 98109, USA", "Washington, USA")
            );

}
