CREATE TABLE public.category
(
    id            INTEGER           NOT NULL,
    name          VARCHAR(60)       NOT NULL,
    url           VARCHAR(60)       not null,
    product_count INTEGER DEFAULT 0 NOT NULL,
    CONSTRAINT category_pkey PRIMARY KEY (id),
    CONSTRAINT category_url_key UNIQUE (url)
)
WITH (oids = false);

CREATE TABLE public.producer
(
    id            INTEGER           NOT NULL,
    name          VARCHAR(60)       NOT NULL,
    product_count INTEGER DEFAULT 0 NOT NULL,
    CONSTRAINT producer_pkey PRIMARY KEY (id)
)
WITH (oids = false);

CREATE TABLE public.product (
                                id INTEGER NOT NULL UNIQUE ,
                                name VARCHAR(255) NOT NULL ,
                                description text not null ,
                                image_link VARCHAR(255) NOT NULL ,
                                price NUMERIC (8, 2) NOT NULL ,
                                id_category INTEGER NOT NULL ,
                                id_producer INTEGER NOT NULL
);

CREATE TABLE account
(
    id INTEGER PRIMARY KEY not null ,
    name VARCHAR(60) NOT NULL ,
    email varchar(100) unique NOT NULL

)