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
- [License](#license)

## Introduction

With Smartproxy API you will be able to access proxies and take full control over your account.

- Create, Update, Delete and set traffic limits for your proxy users
- Pull out reports for traffic usage
- Create and Delete whitelisted IPs to simplify authentication
- Filter and list all endpoints with ports
- Check the status of your current subscription

Need more API code examples? Visit our [main documentation](https://help.smartproxy.com/reference). <br />
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

### Examples

| Programming Language | Example location         | Download |
| -------------------- | ------------------------ | -------- |
| PHP                  | [java/authentication.java](https://github.com/Smartproxy/Smartproxy-API/blob/master/java/authentication.java) |``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/java/authentication.java > authentication.java ``` |
| Java                 | [php/authentication.php](https://github.com/Smartproxy/Smartproxy-API/blob/master/php/authentication.php)   | ``` curl https://raw.githubusercontent.com/Smartproxy/Smartproxy-API/master/php/authentication.php > php/authentication.php ``` |

## License

All code is released under [MIT License](https://github.com/Smartproxy/Smartproxy/blob/master/LICENSE)
