alter table T_DOCUMENT add column DOC_GENDER_C varchar(500);
alter table T_DOCUMENT add column DOC_RACE_C varchar(500);
alter table T_DOCUMENT add column DOC_EMAIL_C varchar(500) not null;
alter table T_DOCUMENT add column DOC_UNDERGRAD_UNIV_C varchar(500) not null;
alter table T_DOCUMENT add column DOC_MAJOR_C varchar(500) not null;
alter table T_DOCUMENT add column DOC_MINOR_C varchar(500);
alter table T_DOCUMENT add column DOC_GPA_C varchar(4) not null;
alter table T_DOCUMENT add column DOC_MCAT_C int;
alter table T_DOCUMENT add column DOC_LSAT_C int;
alter table T_DOCUMENT add column DOC_GRE_C int;
alter table T_DOCUMENT add column DOC_GMAT_C int;


alter table T_DOCUMENT drop column DOC_LANGUAGE_C;
alter table T_DOCUMENT drop column DOC_PUBLISHER_C;
alter table T_DOCUMENT drop column DOC_TYPE_C;
alter table T_DOCUMENT drop column DOC_COVERAGE_C;
alter table T_DOCUMENT drop column DOC_RIGHTS_C;
alter table T_DOCUMENT drop column DOC_SUBJECT_C;
alter table T_DOCUMENT drop column DOC_FORMAT_C;
alter table T_DOCUMENT drop column DOC_SOURCE_C;


update T_CONFIG set CFG_VALUE_C = '28' where CFG_ID_C = 'DB_VERSION';