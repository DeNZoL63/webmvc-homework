CREATE TABLE orders
(
    orderNumber TEXT(32) PRIMARY KEY,
    userName    TEXT(30) NOT NULL,
    password    TEXT(30) NOT NULL,
    returnURL   TEXT(512) NOT NULL,
    failURL     TEXT(512) NOT NULL,
    currency    INTEGER(3) NOT NULL DEFAULT 810 CHECK (currency >= 0)
);