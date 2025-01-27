

CREATE TABLE `category` (
  `id` serial,
  `name` varchar(128) NOT NULL


CREATE TABLE `orders` (
  `id` serial,
  `totalprice` double NOT NULL,
  `delivery_adress` varchar(128) NOT NULL,
  `status_id` bigint(20) NOT NULL,
  `payment_status_id` bigint(20) NOT NULL,
  `products_id` bigint(20) NOT NULL,
  `users_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;



CREATE TABLE `orders_products` (
  `id` serial,
  `quantity` int(11) NOT NULL,
  `products_id` bigint(20) NOT NULL,
  `orders_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `payment_status` (
  `id`  serial,
  `name` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;



CREATE TABLE `products` (
  `id` serial,
  `name` varchar(128) NOT NULL,
  `price` double NOT NULL,
  `category_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;



CREATE TABLE `status` (
  `id`  serial,
  `name` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `users` (
  `id`  serial,
  `first name` varchar(128) NOT NULL,
  `last name` varchar(128) NOT NULL,
  `username` varchar(128) NOT NULL,
  `email` varchar(128) NOT NULL,
  `password` varchar(128) NOT NULL,
  `isAdmin` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;



	