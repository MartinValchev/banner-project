----banner data
INSERT INTO banner_campaign.banner (id,banner_id,banner_name, banner_size) VALUES ('92d944be-ba2e-9dea-670e-53a16c6ff0d0', 15432, 'rectangle', '300x500');
INSERT INTO banner_campaign.banner (id,banner_id,banner_name, banner_size) VALUES ('d25892f6-3041-eba8-e5e5-9267c2db868b', 15433, 'rectangle-small', '200x350');
INSERT INTO banner_campaign.banner (id,banner_id,banner_name, banner_size) VALUES ('bdc0dfe2-11c1-f724-7881-b9442fdf0f3f', 15434, 'rectangle-wide', '200x600');
INSERT INTO banner_campaign.banner (id,banner_id,banner_name, banner_size) VALUES ('e68c20a2-d58e-bcb9-95c2-d2f8c139ca63', 15435, 'half page', '300x600');
INSERT INTO banner_campaign.banner (id,banner_id,banner_name, banner_size) VALUES ('2d7e1154-0410-5316-e9fb-5ae5878d491b', 15436, 'half page', '300x700');
INSERT INTO banner_campaign.banner (id,banner_id,banner_name, banner_size) VALUES ('953676b9-b607-302c-7ddf-16010759180c', 15437, 'megaboard', '100x600');
INSERT INTO banner_campaign.banner (id,banner_id,banner_name, banner_size) VALUES ('9d531f5e-ef03-d3b1-7363-2e496e34f02c', 15438, 'megaboard', '200x600');
-- company
INSERT INTO banner_campaign.company (id, company_id, company_name, notes) VALUES ('e452dbb1-e849-7a5f-4d7e-8e9fe478c54a', 25743, 'FirmaBrima', 'very cool steel company ');
INSERT INTO banner_campaign.company (id, company_id, company_name, notes) VALUES ('f2cf03e4-e249-5d44-6838-6d61bf1cb10c', 25744, 'SloppyProject', 'vegetable company');
INSERT INTO banner_campaign.company (id, company_id, company_name, notes) VALUES ('3041de4d-8eb5-3331-dd5f-365c2e60e5cb', 25745, 'Communications Inc', 'PR company');
--website
INSERT INTO banner_campaign.website (id, website_id, website_domain, description) VALUES('c8f8d7fc-ddd7-0741-5bc5-3b5e8df08559', 435651, 'nishava-street.com', 'politically oriented news site');
INSERT INTO banner_campaign.website (id, website_id, website_domain, description) VALUES('4ec1efbe-a703-4c2b-3ec6-e44bd2f3e7f0', 435652, 'posh-street.com', 'lifestyle oriented news site');
INSERT INTO banner_campaign.website (id, website_id, website_domain, description) VALUES('7e3424ef-eaaa-acbc-7851-e50bebfd7197', 435653, 'sports-street.com', 'sports oriented news site');
--website-position nishava street
INSERT INTO banner_campaign.website_position (id, position_name, website_position_id, expected_impressions, website_id) VALUES ('2b7fb9db-da83-dbad-ba5e-e9a8bdbb118a', 'header position', 53321, 100000, 'c8f8d7fc-ddd7-0741-5bc5-3b5e8df08559');
INSERT INTO banner_campaign.website_position (id, position_name, website_position_id, expected_impressions, website_id) VALUES ('eceb4a9f-a521-4dd0-3320-3b22ee4a4c6c', 'left position', 53322, 80000, 'c8f8d7fc-ddd7-0741-5bc5-3b5e8df08559');
INSERT INTO banner_campaign.website_position (id, position_name, website_position_id, expected_impressions, website_id) VALUES ('6b6982f2-2485-5db0-4259-8ca7590babbe', 'right position', 53323, 85000, 'c8f8d7fc-ddd7-0741-5bc5-3b5e8df08559');
INSERT INTO banner_campaign.website_position (id, position_name, website_position_id, expected_impressions, website_id) VALUES ('6e2bb1a8-7a9a-52ea-759d-7ab74b1f4317', 'mid position', 53324, 90000, 'c8f8d7fc-ddd7-0741-5bc5-3b5e8df08559');
INSERT INTO banner_campaign.website_position (id, position_name, website_position_id, expected_impressions, website_id) VALUES ('3793d4ef-176a-09c8-82ee-0572ded63d34', 'footer position', 53325, 60000, 'c8f8d7fc-ddd7-0741-5bc5-3b5e8df08559');
--website-position posh-street.com
INSERT INTO banner_campaign.website_position (id, position_name, website_position_id, expected_impressions, website_id) VALUES ('aef99f65-40de-9a52-b444-749a8cbf201c', 'header position', 53326, 950000, '4ec1efbe-a703-4c2b-3ec6-e44bd2f3e7f0');
INSERT INTO banner_campaign.website_position (id, position_name, website_position_id, expected_impressions, website_id) VALUES ('0f7b3df6-b928-e2f2-a460-ac85223abcd2', 'left position', 53327, 75000, '4ec1efbe-a703-4c2b-3ec6-e44bd2f3e7f0');
INSERT INTO banner_campaign.website_position (id, position_name, website_position_id, expected_impressions, website_id) VALUES ('aa423cd3-0dbd-4f16-174b-57041c451327', 'right position', 53328, 75000, '4ec1efbe-a703-4c2b-3ec6-e44bd2f3e7f0');
INSERT INTO banner_campaign.website_position (id, position_name, website_position_id, expected_impressions, website_id) VALUES ('e81ec92b-10d0-3c4a-3ca2-d6db4e4eb464', 'mid position', 53329, 80000, '4ec1efbe-a703-4c2b-3ec6-e44bd2f3e7f0');
INSERT INTO banner_campaign.website_position (id, position_name, website_position_id, expected_impressions, website_id) VALUES ('2d529884-745d-39d1-726c-0c9e6aa12902', 'footer position', 53330, 50000, '4ec1efbe-a703-4c2b-3ec6-e44bd2f3e7f0');
--website-position sports-street.com
INSERT INTO banner_campaign.website_position (id, position_name, website_position_id, expected_impressions, website_id) VALUES ('9cbc3f0e-ee6d-b6cb-8605-078bc5f6bcbc', 'header position', 53331, 900000, '7e3424ef-eaaa-acbc-7851-e50bebfd7197');
INSERT INTO banner_campaign.website_position (id, position_name, website_position_id, expected_impressions, website_id) VALUES ('c3b51d9b-0695-adc0-9f4e-cd209e6e89ca', 'left position', 53332, 70000, '7e3424ef-eaaa-acbc-7851-e50bebfd7197');
INSERT INTO banner_campaign.website_position (id, position_name, website_position_id, expected_impressions, website_id) VALUES ('2b43bf8d-34c6-a0fa-98b1-4341fd97bb1c', 'right position', 53333, 70000, '7e3424ef-eaaa-acbc-7851-e50bebfd7197');
INSERT INTO banner_campaign.website_position (id, position_name, website_position_id, expected_impressions, website_id) VALUES ('2d7a8dee-8e0d-8680-87d0-973c1a3a584a', 'mid position', 53334, 75000, '7e3424ef-eaaa-acbc-7851-e50bebfd7197');
INSERT INTO banner_campaign.website_position (id, position_name, website_position_id, expected_impressions, website_id) VALUES ('bb553edf-a7e1-670a-64b3-b5d831b34f88', 'footer position', 53335, 45000, '7e3424ef-eaaa-acbc-7851-e50bebfd7197');
--campaign company: firma birma
INSERT INTO banner_campaign.campaign (id, campaign_id, company_id, campaign_name, start_date, end_date) VALUES ('7a0255f7-7ddd-4e99-397a-dbfd8fac603d', 365421, 'e452dbb1-e849-7a5f-4d7e-8e9fe478c54a', 'New August trends', '2025-08-10 10:00:00','2025-08-30 10:00:00');
INSERT INTO banner_campaign.campaign (id, campaign_id, company_id, campaign_name, start_date, end_date) VALUES ('f2aa3953-c5e2-ef8e-b894-64afc9f4fa4d', 365422, 'e452dbb1-e849-7a5f-4d7e-8e9fe478c54a', 'Sports Selected', '2025-08-15 10:00:00','2025-09-16 10:00:00');
-- campaign company: SloppyProject
INSERT INTO banner_campaign.campaign (id, campaign_id, company_id, campaign_name, start_date, end_date) VALUES ('6f20b727-26fd-f7b0-5dc7-d3fd6996918f', 365423, 'f2cf03e4-e249-5d44-6838-6d61bf1cb10c', 'Fashon on focus', '2025-08-12 10:00:00','2025-09-20 10:00:00');
INSERT INTO banner_campaign.campaign (id, campaign_id, company_id, campaign_name, start_date, end_date) VALUES ('c530ca50-e19c-2ad9-40b3-3581c801990e', 365424, 'f2cf03e4-e249-5d44-6838-6d61bf1cb10c', 'Business as usual', '2025-08-12 10:00:00','2025-09-20 10:00:00');
-- campaign company: Communications Inc
INSERT INTO banner_campaign.campaign (id, campaign_id, company_id, campaign_name, start_date, end_date) VALUES ('99ae6d1b-a78f-91d6-14bf-7623c8bb3b90', 365425, '3041de4d-8eb5-3331-dd5f-365c2e60e5cb', 'New ideas revealed', '2025-09-05 10:00:00','2025-09-20 10:00:00');
INSERT INTO banner_campaign.campaign (id, campaign_id, company_id, campaign_name, start_date, end_date) VALUES ('0a1e5ca5-e71c-77e6-1c74-fc0d3b62bd92', 365426, '3041de4d-8eb5-3331-dd5f-365c2e60e5cb', 'Sports on new level', '2025-08-12 10:00:00','2025-09-05 10:00:00');
-- campaign banner position - Communications Inc - nishava street
INSERT INTO banner_campaign.campaign_banner_position (id, campaign_id, banner_id, website_position_id, impressions) VALUES ('d9d91abe-74cf-a5b6-58cf-1af9965ea7ac', '99ae6d1b-a78f-91d6-14bf-7623c8bb3b90', '92d944be-ba2e-9dea-670e-53a16c6ff0d0', '2b7fb9db-da83-dbad-ba5e-e9a8bdbb118a', 12000);
INSERT INTO banner_campaign.campaign_banner_position (id, campaign_id, banner_id, website_position_id, impressions) VALUES ('d47ef46e-3907-45af-ba37-c313f9f02938', '99ae6d1b-a78f-91d6-14bf-7623c8bb3b90', '953676b9-b607-302c-7ddf-16010759180c', '6b6982f2-2485-5db0-4259-8ca7590babbe', 10000);
INSERT INTO banner_campaign.campaign_banner_position (id, campaign_id, banner_id, website_position_id, impressions) VALUES ('182ff048-c6b1-fdb4-dac5-88a3dabd0413', '99ae6d1b-a78f-91d6-14bf-7623c8bb3b90', '953676b9-b607-302c-7ddf-16010759180c', '3793d4ef-176a-09c8-82ee-0572ded63d34', 10000);
-- campaign banner position - Sports Selected on website: sports-street.com
INSERT INTO banner_campaign.campaign_banner_position (id, campaign_id, banner_id, website_position_id, impressions) VALUES ('ab3a3f77-f829-8040-305e-e78abe707ac1', 'f2aa3953-c5e2-ef8e-b894-64afc9f4fa4d', '2d7e1154-0410-5316-e9fb-5ae5878d491b', '9cbc3f0e-ee6d-b6cb-8605-078bc5f6bcbc', 20000);
INSERT INTO banner_campaign.campaign_banner_position (id, campaign_id, banner_id, website_position_id, impressions) VALUES ('ff068de5-4d6e-0d14-7006-1b596a22265c', 'f2aa3953-c5e2-ef8e-b894-64afc9f4fa4d', '92d944be-ba2e-9dea-670e-53a16c6ff0d0', '2b43bf8d-34c6-a0fa-98b1-4341fd97bb1c', 10000);
INSERT INTO banner_campaign.campaign_banner_position (id, campaign_id, banner_id, website_position_id, impressions) VALUES ('9d4a9314-56cf-882f-1970-9b273029b30d', 'f2aa3953-c5e2-ef8e-b894-64afc9f4fa4d', 'bdc0dfe2-11c1-f724-7881-b9442fdf0f3f', '2d7a8dee-8e0d-8680-87d0-973c1a3a584a', 11000);
INSERT INTO banner_campaign.campaign_banner_position (id, campaign_id, banner_id, website_position_id, impressions) VALUES ('4b47870d-9db7-a9d7-39e4-6e3f55abc138', 'f2aa3953-c5e2-ef8e-b894-64afc9f4fa4d', 'bdc0dfe2-11c1-f724-7881-b9442fdf0f3f', 'bb553edf-a7e1-670a-64b3-b5d831b34f88', 11000);
-- campaign banner position -  New August trends on website: posh-street.com
INSERT INTO banner_campaign.campaign_banner_position (id, campaign_id, banner_id, website_position_id, impressions) VALUES ('8f7017b9-36fe-164b-a596-26d30dba1f93', '7a0255f7-7ddd-4e99-397a-dbfd8fac603d', 'bdc0dfe2-11c1-f724-7881-b9442fdf0f3f', 'aef99f65-40de-9a52-b444-749a8cbf201c', 16000);
INSERT INTO banner_campaign.campaign_banner_position (id, campaign_id, banner_id, website_position_id, impressions) VALUES ('7adb220e-5431-661f-08ac-d913986d9fb7', '7a0255f7-7ddd-4e99-397a-dbfd8fac603d', '2d7e1154-0410-5316-e9fb-5ae5878d491b', 'e81ec92b-10d0-3c4a-3ca2-d6db4e4eb464', 14000);
INSERT INTO banner_campaign.campaign_banner_position (id, campaign_id, banner_id, website_position_id, impressions) VALUES ('265cc94d-cbc1-f7b5-5df1-7ee018f8999b', '7a0255f7-7ddd-4e99-397a-dbfd8fac603d', '9d531f5e-ef03-d3b1-7363-2e496e34f02c', '2d529884-745d-39d1-726c-0c9e6aa12902', 11000);
