DROP TABLE IF EXISTS foo;
DROP TABLE IF EXISTS bar;

CREATE TABLE foo
(
    aaa00_id          int8    NOT NULL GENERATED ALWAYS AS IDENTITY,
    aaa00_last_status int4    NULL,
    aaa00_qtd         int4    NULL,
    aaa00_description varchar NULL,
    aaa00_id_bar int8 NOT NULL,
    CONSTRAINT foo_pk PRIMARY KEY (aaa00_id)
);

CREATE TABLE bar
(
    aaa01_id        bigint  NOT NULL GENERATED ALWAYS AS IDENTITY,
    aaa01_comments varchar NULL,
    CONSTRAINT bar_pk PRIMARY KEY (aaa01_id)
);

ALTER TABLE foo ADD CONSTRAINT foo_fk FOREIGN KEY (aaa00_id_bar) REFERENCES bar(aaa01_id);

CREATE EXTENSION unaccent;