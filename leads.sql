--
-- PostgreSQL database dump
--

-- Dumped from database version 15.3
-- Dumped by pg_dump version 15.1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: leads_app; Type: DATABASE; Schema: -; Owner: leads_app
--

CREATE DATABASE leads_app WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = icu LOCALE = 'en_US.UTF-8' ICU_LOCALE = 'en-US';


ALTER DATABASE leads_app OWNER TO leads_app;

\connect leads_app

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: leads; Type: TABLE; Schema: public; Owner: rizwan
--

CREATE TABLE public.leads (
    lead_id integer NOT NULL,
    first_name character varying(255) NOT NULL,
    middle_name character varying(255),
    last_name character varying(255) NOT NULL,
    gender character varying(10) NOT NULL,
    mobile_number character varying(10) NOT NULL,
    date_of_birth date NOT NULL,
    email character varying(255) NOT NULL
);


ALTER TABLE public.leads OWNER TO rizwan;

--
-- Name: leads_lead_id_seq; Type: SEQUENCE; Schema: public; Owner: rizwan
--

CREATE SEQUENCE public.leads_lead_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.leads_lead_id_seq OWNER TO rizwan;

--
-- Name: leads_lead_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: rizwan
--

ALTER SEQUENCE public.leads_lead_id_seq OWNED BY public.leads.lead_id;


--
-- Name: leads lead_id; Type: DEFAULT; Schema: public; Owner: rizwan
--

ALTER TABLE ONLY public.leads ALTER COLUMN lead_id SET DEFAULT nextval('public.leads_lead_id_seq'::regclass);


--
-- Data for Name: leads; Type: TABLE DATA; Schema: public; Owner: rizwan
--

COPY public.leads (lead_id, first_name, middle_name, last_name, gender, mobile_number, date_of_birth, email) FROM stdin;
\.


--
-- Name: leads_lead_id_seq; Type: SEQUENCE SET; Schema: public; Owner: rizwan
--

SELECT pg_catalog.setval('public.leads_lead_id_seq', 1, false);


--
-- Name: leads leads_pkey; Type: CONSTRAINT; Schema: public; Owner: rizwan
--

ALTER TABLE ONLY public.leads
    ADD CONSTRAINT leads_pkey PRIMARY KEY (lead_id);


--
-- PostgreSQL database dump complete
--

