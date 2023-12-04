create function delete_customer(id_customer_param integer) returns void
    language plpgsql
as
$$
BEGIN
    DELETE
    FROM customer
    WHERE id_customer = id_customer_param;
END;
$$;

alter function delete_customer(integer) owner to postgres;

