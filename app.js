const express = require('express');
const { Response } = require('express');

const app = express();

// Define your constants
const SAMPLE_RESOURCE_IMPL = {
    AWS_SECRET_ACCESS_KEY: "kDlITsVnVt3IOOF9T4zTv5yLvNfpTjzX8W9PEA",
    AZURE_STORAGE_CONNECTION_STRING: "DefaultEndpointsProtocol=https;AccountName=example;AccountKey=s8d7as56d87as6d87as6d5as76d8as76d8as7d;EndpointSuffix=core.windows.net",
    GCP_SERVICE_ACCOUNT_KEY: "\"type\": \"service_account\", \"project_id\": \"my-project\", \"private_key_id\": \"abc123\", \"private_key\": \"-----BEGIN PRIVATE KEY-----\\nMIIBVwIBADANBgkqhkiG9w0BAQEFAASCAT8wggE7AgEAAkEA6emLo2mBn...\"",
    GITHUB_OAUTH_TOKEN: "gho_16C7e42F292c6912E7710c838347Ae178B4a",
    DOCKER_REGISTRY_AUTH_TOKEN: "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImV4YW1wbGUifQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c",
    SLACK_BOT_USER_OAUTH_TOKEN: "xoxb-2222-3333445566-7rTYui8V1RQjk",
    NPM_ACCESS_TOKEN: "npm_01D5N8ZRVEQZ9GQM5C9Q6ZBZ17",
    SALESFORCE_ACCESS_TOKEN: "00Dx0000000BV7z!AR8AQK1d8DxNzZLkG8FzERGkE5S4oO7G.0oWYP8pWiFVZ.TFJL3ZLHrXxmTKZcG0n9BmJ0ZLkG8FzERGkE5S4oO7",
    SHOPIFY_ACCESS_TOKEN: "shpat_6a2a1b2c3d4e5f67890123456789",
    TWILIO_ACCOUNT_SID: "AC309c7553ed2345fe75b6160a1f2345",
    TWILIO_AUTH_TOKEN: "34d85ee90a8e4d1a05b567ef23456789",
    MAILGUN_API_KEY: "key-3ax6xnjp29jd6fds4gc373sgvjxteol0",
    STRIPE_API_KEY: "sk_test_4eC39HqLyjWDarjtT1zdp7dc",
    HEROKU_API_KEY: "8d830346-978d-464a-a8c3-4d9193e0757f",
    MONGODB_ATLAS_CONNECTION_STRING: "mongodb+srv://testuser:password123@cluster0.9mioz.mongodb.net/myFirstDatabase?retryWrites=true&w=majority",
    PAYPAL_CLIENT_ID: "AbcDEf123ghiJKLmnoPQRsTUVwxyZABCDEFGHIJ",
    PAYPAL_SECRET: "EFGH5678ijklMNOpqrSTUV01234wxyzABCDEfghI",
    JENKINS_API_TOKEN: "11a12b34c56d78e90123f45g67h89012",
    GITLAB_PERSONAL_ACCESS_TOKEN: "glpat-xxYYzz1234567890abcdef",
    JIRA_API_TOKEN: "DacEfGhIjKlmNoPQRsTuVwXyZ0123456789",
    SENTRY_AUTH_TOKEN: "f0ec12ab34cd56ef7890gh12ij34kl56",
    TRELLO_API_KEY: "12345abcdef67890abcdef12345",
    TRELLO_TOKEN: "abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890",
    KUBERNETES_SERVICE_ACCOUNT_TOKEN: "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJAbExaRnpkR2x0YmpFd01IZzROekExTmpnNE5qWXpNek13",
    SPOTIFY_ACCESS_TOKEN: "BQCtqXJxcW4sUE4WZARFvZ2l3d4cYYfPfWwZ9E4f3AbCdefGHijkLmNOPQRsTUVWXYZ",
    ZOOM_JWT_TOKEN: "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJAbExaRnpkR2x0YmpFd01IZzROekExTmpnNE5qWXpNek13",
    DATADOG_API_KEY: "abc123d4e5f6789a0b1c2d3e4f5g6h7i",
    FIREBASE_CUSTOM_TOKEN: "eyJhbGciOiJSUzI1NiIsImtpZCI6IjFlOWQzZTkzZTFmMjY5MWNiY2U2Y2FiYTNkZGI0MTFmNDJiYmRhOTQifQ",
    QUICKBOOKS_ACCESS_TOKEN: "lvprdEmVAREf81234567sRg9ZfAabBcdEfGHIJKLMnopQrSt"
};

// Define your function
function sayHello(req, res) {
    const responseText = "Hello, World!";
    res.status(200).type('text/html').send(responseText);
}

// Define your routes
app.get('/hello', sayHello);

// Start the server
const port = process.env.PORT || 3000;
app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});

// Export the module
module.exports = {
    SAMPLE_RESOURCE_IMPL,
    sayHello
};

