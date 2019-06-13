<p align="center">
    <a href="https://smartproxy.com/"><img src="https://smartproxy.com/wp-content/themes/smartproxy/images/smartproxy-logo.svg" alt="Smartproxy logo" width="200" height="50"></a>
  </a>
</p>

<p align="center">
    <a href="https://dashboard.smartproxy.com/register?coupon=GITHUB19"><img src="https://i.imgur.com/dMCdcoI.jpg" alt="Smartproxy promo" width="550" height="150"></a>
  </a>
</p>

## List of contents

- [Introduction](#introduction)
- [Authentication](#authentication)
- [Get sub users](#get-sub-users)
- [Create subuser](#create-subuser)
- [Update subuser](#update-subuser)
- [Get sub user traffic](#get-sub-user-traffic)
- [Delete subuser](#delete-subuser)
- [Get whitelisted IPs](#get-whitelisted-ips)
- [Delete subuser](#delete-subuser)
- [Get whitelisted IPs](#get-whitelisted-ips)
- [Add whitelisted IPs](#add-whitelisted-ips)
- [Delete whitelisted IP](#delete-whitelisted-ip)
- [Get subscriptions](#get-subscriptions)
- [Get endpoints](#get-endpoints)
- [Get endpoints by type](#get-endpoints-by-type)
- [License](#license)

## Introduction

With Smartproxy API you will be able to access proxies and take full control over your account.

- Create, Update, Delete and set traffic limits for your proxy users
- Pull out reports for traffic usage
- Create and Delete whitelisted IPs to simplify authentication
- Filter and list all endpoints with ports
- Check the status of your current subscription

Need more API code examples or information? Visit our [main documentation](https://help.smartproxy.com/reference). <br />
Looking for something else? Visit our [General Repository](https://github.com/Smartproxy/Smartproxy/) for more fun.

## Authentication

API Link: https://api.smartproxy.com/v1/auth

### Request

`POST /auth/`

### Response
    
    HTTP/1.1 200 OK
    Content-Type: application/json
    {
    "user_id": "d3af2539-4259-4484-a355-062fd1111"
    "token": "sdfdsfeXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyODI0LCJ1c2VybmFtZSI6InBhdWxpdXN0YXIiLCJleHAiOjE"
    }
    
Take a note of or implement functionality to pass `user_id` and `token` parameters to other API calls as it will be required to navigate.

### Examples

| Programming Language | Example location         | Download |
| -------------------- | ------------------------ | -------- |
| PHP                  | [java/authentication.java](https://github.com/Smartproxy/Smartproxy-API/blob/master/java/authentication.java) |``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/java/authentication.java > authentication.java ``` |
| Java                 | [php/authentication.php](https://github.com/Smartproxy/Smartproxy-API/blob/master/php/authentication.php)   | ``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/php/authentication.php > php/authentication.php ``` |

## Get sub users

API Link: https://api.smartproxy.com/v1/users/{userId}/sub-users

### Request

`GET users/:userId/sub-users`

### Response
    
    HTTP/1.1 200 OK
    Content-Type: application/json
    [
      0:{
        "id":24570
        "username":"name"
        "status":"active"
        "created_at":"2019-03-23 13:08"
        "traffic_limit":NULL
        "service_type":"residential_proxies"
      }
    ]

### Examples

| Programming Language | Example location         | Download |
| -------------------- | ------------------------ | -------- |
| PHP                  | [java/get_subusers.java](https://github.com/Smartproxy/Smartproxy-API/blob/master/java/get_subusers.java) |``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/java/get_subusers.java > get_subusers.java ``` |
| Java                 | [php/get_subusers.php](https://github.com/Smartproxy/Smartproxy-API/blob/master/php/get_subusers.php)   | ``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/php/get_subusers.php > get_subusers.php ``` |

## Create subuser

API Link: https://api.smartproxy.com/v1/users/{userId}/sub-users

### Request

`POST users/:userId/sub-users`

### Request body

`{"username":"","password":"","service_type":""}`

### Response
    
    HTTP/1.1 201 Created
    Content-Type: application/json
    {}

### Examples

| Programming Language | Example location         | Download |
| -------------------- | ------------------------ | -------- |
| PHP                  | [java/create_subuser.java](https://github.com/Smartproxy/Smartproxy-API/blob/master/java/create_subuser.java) |``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/java/create_subuser.java > create_subuser.java ``` |
| Java                 | [php/create_subuser.php](https://github.com/Smartproxy/Smartproxy-API/blob/master/php/create_subuser.php)   | ``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/php/create_subuser.php > create_subuser.php ``` |

## Update subuser

API Link: https://api.smartproxy.com/v1/users/{userId}/sub-users

### Request

`PUT users/:userId/sub-users`

### Request body

`{"traffic_limit":0,"password":""}`

### Response
    
    HTTP/1.1 201 Created
    Content-Type: application/json
    {}

### Examples

| Programming Language | Example location         | Download |
| -------------------- | ------------------------ | -------- |
| PHP                  | [java/update_subuser.java](https://github.com/Smartproxy/Smartproxy-API/blob/master/java/update_subuser.java) |``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/java/update_subuser.java > update_subuser.java ``` |
| Java                 | [php/update_subuser.php](https://github.com/Smartproxy/Smartproxy-API/blob/master/php/update_subuser.php)   | ``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/php/update_subuser.php > update_subuser.php ``` |

## Get sub user traffic

API Link: https://api.smartproxy.com/v1/users/{userId}/sub-users/{username}/traffic

### Request

`GET users/:userId/sub-users/:username/traffic`

### Response
    
    HTTP/1.1 200 OK
    Content-Type: application/json
    {
    "traffic":0.04
    }

### Examples

| Programming Language | Example location         | Download |
| -------------------- | ------------------------ | -------- |
| PHP                  | [java/get_subuser_traffic.java](https://github.com/Smartproxy/Smartproxy-API/blob/master/java/get_subuser_traffic.java) |``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/java/get_subuser_traffic.java > get_subuser_traffic.java ``` |
| Java                 | [php/get_subuser_traffic.php](https://github.com/Smartproxy/Smartproxy-API/blob/master/php/get_subuser_traffic.php)   | ``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/php/get_subuser_traffic.php > get_subuser_traffic.php ``` |

## Delete subuser

API Link: https://api.smartproxy.com/v1/users/{userId}/sub-users/{sub_user_id}

### Request

`DELETE users/:userId/sub-users/:sub_user_id`

### Response
    
    HTTP/1.1 204 No Content
    Content-Type: application/json
    {}

### Examples

| Programming Language | Example location         | Download |
| -------------------- | ------------------------ | -------- |
| PHP                  | [java/delete_subuser.java](https://github.com/Smartproxy/Smartproxy-API/blob/master/java/delete_subuser.java) |``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/java/delete_subuser.java > delete_subuser.java ``` |
| Java                 | [php/delete_subuser.php](https://github.com/Smartproxy/Smartproxy-API/blob/master/php/delete_subuser.php)   | ``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/php/delete_subuser.php > delete_subuser.php ``` |

## Get whitelisted IPs

API Link: https://api.smartproxy.com/v1/users/{userId}/whitelisted-ips

### Request

`GET users/:userId/whitelisted-ips`

### Response
    
    HTTP/1.1 200 OK
    Content-Type: application/json
    [
      0:{
        "id":69489
        "ip":"127.0.0.1"
        "enabled":true
        "created_at":"2019-05-22 12:44"
        }
    ]

### Examples

| Programming Language | Example location         | Download |
| -------------------- | ------------------------ | -------- |
| PHP                  | [java/get_whitelisted_ips.java](https://github.com/Smartproxy/Smartproxy-API/blob/master/java/get_whitelisted_ips.java) |``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/java/get_whitelisted_ips.java > get_whitelisted_ips.java ``` |
| Java                 | [php/get_whitelisted_ips.php](https://github.com/Smartproxy/Smartproxy-API/blob/master/php/get_whitelisted_ips.php)   | ``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/php/get_whitelisted_ips.php > get_whitelisted_ips.php ``` |

## Add whitelisted IPs

API Link: https://api.smartproxy.com/v1/users/{userId}/whitelisted-ips

### Request

`POST users/:userId/whitelisted-ips`

### Request body

`{"IPAddressList":[null]}`

### Response
    
    HTTP/1.1 200 OK
    Content-Type: application/json
    {}

### Examples

| Programming Language | Example location         | Download |
| -------------------- | ------------------------ | -------- |
| PHP                  | [java/add_whitelisted_ips.java](https://github.com/Smartproxy/Smartproxy-API/blob/master/java/add_whitelisted_ips.java) |``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/java/add_whitelisted_ips.java > add_whitelisted_ips.java ``` |
| Java                 | [php/add_whitelisted_ips.php](https://github.com/Smartproxy/Smartproxy-API/blob/master/php/add_whitelisted_ips.php)   | ``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/php/add_whitelisted_ips.php > add_whitelisted_ips.php ``` |

## Delete whitelisted IP

API Link: https://api.smartproxy.com/v1/users/{userId}/whitelisted-ips/{id}

### Request

`DELETE users/:userId/whitelisted-ips/:id`

### Response
    
    HTTP/1.1 204 No Content
    Content-Type: application/json
    {}

### Examples

| Programming Language | Example location         | Download |
| -------------------- | ------------------------ | -------- |
| PHP                  | [java/delete_whitelisted_ip.java](https://github.com/Smartproxy/Smartproxy-API/blob/master/java/delete_whitelisted_ip.java) |``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/java/delete_whitelisted_ip.java > delete_whitelisted_ip.java ``` |
| Java                 | [php/delete_whitelisted_ip.php](https://github.com/Smartproxy/Smartproxy-API/blob/master/php/delete_whitelisted_ip.php)   | ``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/php/delete_whitelisted_ip.php > delete_whitelisted_ip.php ``` |

## Get subscriptions

API Link: https://api.smartproxy.com/v1/users/{userId}/subscriptions

### Request

`GET users/:userId/subscriptions`

### Response
    
    HTTP/1.1 200 OK
    Content-Type: application/json
    {
    "traffic_limit":"50"
    "traffic_per_period":"0.15"
    "users_limit":3
    "ip_address_limit":2
    "valid_from":"2018-11-08"
    "valid_until":"2019-06-30"
    "service_type":"residential_proxies"
    }

### Examples

| Programming Language | Example location         | Download |
| -------------------- | ------------------------ | -------- |
| PHP                  | [java/get_subscriptions.java](https://github.com/Smartproxy/Smartproxy-API/blob/master/java/get_subscriptions.java) |``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/java/get_subscriptions.java > get_subscriptions.java ``` |
| Java                 | [php/get_subscriptions.php](https://github.com/Smartproxy/Smartproxy-API/blob/master/php/get_subscriptions.php)   | ``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/php/get_subscriptions.php > get_subscriptions.php ``` |

## Get endpoints

API Link: https://api.smartproxy.com/v1/endpoints

### Request

`GET endpoints`

### Response
    
    HTTP/1.1 200 OK
    Content-Type: application/json
    [
      0:{
        "type":"random"
        "available_locations":"148"
        "url":"endpoints/random"
      }
      1:{
        "type":"sticky"
        "available_locations":"62"
        "url":"endpoints/sticky"
      }
    ]

### Examples

| Programming Language | Example location         | Download |
| -------------------- | ------------------------ | -------- |
| PHP                  | [java/get_endpoints.java](https://github.com/Smartproxy/Smartproxy-API/blob/master/java/get_endpoints.java) |``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/java/get_endpoints.java > get_endpoints.java ``` |
| Java                 | [php/get_endpoints.php](https://github.com/Smartproxy/Smartproxy-API/blob/master/php/get_endpoints.php)   | ``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/php/get_endpoints.php > get_endpoints.php ``` |

## Get endpoints by type

API Link: https://api.smartproxy.com/v1/endpoints/{type}

### Request

`GET endpoints/:type`

### Response
    
    HTTP/1.1 200 OK
    Content-Type: application/json
    [
      0:{
        "location":"Random"
        "hostname":"gate.smartproxy.com"
        "port_range":"7000"
      }
      1:{
        "location":"Canada"
        "hostname":"ca.smartproxy.com"
        "port_range":"20000"
      }
    ]

### Examples

| Programming Language | Example location         | Download |
| -------------------- | ------------------------ | -------- |
| PHP                  | [java/get_endpoints_by_type.java](https://github.com/Smartproxy/Smartproxy-API/blob/master/java/get_endpoints_by_type.java) |``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/java/java/get_endpoints_by_type.java > get_endpoints_by_type.java ``` |
| Java                 | [php/get_endpoints_by_type.php](https://github.com/Smartproxy/Smartproxy-API/blob/master/php/get_endpoints_by_type.php)   | ``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/php/get_endpoints_by_type.php > get_endpoints_by_type.php ``` |

## License

All code is released under [MIT License](https://github.com/Smartproxy/Smartproxy/blob/master/LICENSE)
