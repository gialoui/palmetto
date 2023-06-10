# Palmetto Services

## Introduction
Plametto is a family friendly pizza online ordering system. 

## Requirements

Plametto is a pizza business run by a family for over 20 years. After the surge of COVID cases, the resto received more and more orders from their hotline. 
That life-changing event shifted their food business to a whole new direction, they want to adapt to the digital life and approach to a broader set of clients who don't get along with the traditional way of ordering via phone call or upgrade the experience of current clients.

For that simple reason, this application is designed to provide customers the fastest way to place and track an order from their phone and web browser in general.

### Version 1.0

We will provide 2 distinct User Interfaces correspond to 2 web applications written in Angular and React:
- Client App (Angular)
- Pizzeria Portal (React)

To make it simple for the first release of the app, we'll primarily focus on the business logics of the client and pizzeria apps. And the only way to pay for your pizza order in this version is cash on delivery.

#### Client App

As a client, I'm able to select one or multiple pizzas and beverages from the menu and submit my order to the pizzeria service. A successful submission will come with a confirmation screen and an ID to find and track the current order.
When customer first place an order, we'll ask them to input basic information to send to the server and then cache that piece of information on their browser (queried by phone number, the technique will be decided later) to be pre-filled later when they order again down the road.

#### Pizzeria Portal

The system receives the order and appends it to the end of the pending order list, the parlor will then process and change the state following this order: NEW (the initial state) -> PROCESSING -> SHIPPING. 
Once the status is set to SHIPPING, we immediately change it to COMPLETED since there's no feature for courier to update the status yet.
It should be noted here that status cannot go back to the previous after setting. In the best case scenario, all orders can be served by the kitchen. 
However, sometimes we might run into the situation where we don't have enough ingredients to cook a dish and sadly have to turn down an order by changing the status to REJECTED with a reason for the rejection.

## Architecture design

This repository consists of 3 microservices:
- order: A service for receiving and storing incoming orders from clients
- courier: In the first version, this service will only be responsible for notifying the client that the order has been shipped. We'll definitely improve in the next launch.
- pizzeria: A service to manage the menu, authenticate parlor and facilitate status update for the order

![alt text](https://github.com/gialoui/palmetto/blob/main/blob/architecture.png?raw=true)

