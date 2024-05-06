import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Component
@Scope("request")
public class SampleResourceImpl{

    // AWS Secret Access Key
    public static final String AWS_SECRET_ACCESS_KEY = "kDlITsVnVt3IOOF9T4zTv5yLvNfpTjzX8W9PEA";

    // Azure Blob Storage Connection String
    public static final String AZURE_STORAGE_CONNECTION_STRING = "DefaultEndpointsProtocol=https;AccountName=example;AccountKey=s8d7as56d87as6d87as6d5as76d8as76d8as7d;EndpointSuffix=core.windows.net";

    // Google Cloud Service Account Key
    public static final String GCP_SERVICE_ACCOUNT_KEY = "\"type\": \"service_account\", \"project_id\": \"my-project\", \"private_key_id\": \"abc123\", \"private_key\": \"-----BEGIN PRIVATE KEY-----\\nMIIBVwIBADANBgkqhkiG9w0BAQEFAASCAT8wggE7AgEAAkEA6emLo2mBn...\"";

    // GitHub OAuth Token
    public static final String GITHUB_OAUTH_TOKEN = "gho_16C7e42F292c6912E7710c838347Ae178B4a";

    // Docker Registry Authentication Token
    public static final String DOCKER_REGISTRY_AUTH_TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImV4YW1wbGUifQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";

    // Slack Bot User OAuth Token
    public static final String SLACK_BOT_USER_OAUTH_TOKEN = "xoxb-2222-3333445566-7rTYui8V1RQjk";

    // NPM Access Token
    public static final String NPM_ACCESS_TOKEN = "npm_01D5N8ZRVEQZ9GQM5C9Q6ZBZ17";

    // Salesforce Access Token
    public static final String SALESFORCE_ACCESS_TOKEN = "00Dx0000000BV7z!AR8AQK1d8DxNzZLkG8FzERGkE5S4oO7G.0oWYP8pWiFVZ.TFJL3ZLHrXxmTKZcG0n9BmJ0ZLkG8FzERGkE5S4oO7";

    // Shopify Access Token
    public static final String SHOPIFY_ACCESS_TOKEN = "shpat_6a2a1b2c3d4e5f67890123456789";

    // Twilio Account SID and Auth Token
    public static final String TWILIO_ACCOUNT_SID = "AC309c7553ed2345fe75b6160a1f2345";
    public static final String TWILIO_AUTH_TOKEN = "34d85ee90a8e4d1a05b567ef23456789";

    // Mailgun API Key
    public static final String MAILGUN_API_KEY = "key-3ax6xnjp29jd6fds4gc373sgvjxteol0";

    // Stripe API Key
    public static final String STRIPE_API_KEY = "sk_test_4eC39HqLyjWDarjtT1zdp7dc";

    // Heroku API Key
    public static final String HEROKU_API_KEY = "8d830346-978d-464a-a8c3-4d9193e0757f";

    // MongoDB Atlas Connection String
    public static final String MONGODB_ATLAS_CONNECTION_STRING = "mongodb+srv://testuser:password123@cluster0.9mioz.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";

    // PayPal Client ID and Secret
    public static final String PAYPAL_CLIENT_ID = "AbcDEf123ghiJKLmnoPQRsTUVwxyZABCDEFGHIJ";
    public static final String PAYPAL_SECRET = "EFGH5678ijklMNOpqrSTUV01234wxyzABCDEfghI";

    // Jenkins API Token
    public static final String JENKINS_API_TOKEN = "11a12b34c56d78e90123f45g67h89012";

    // GitLab Personal Access Token
    public static final String GITLAB_PERSONAL_ACCESS_TOKEN = "glpat-xxYYzz1234567890abcdef";

    // JIRA API Token
    public static final String JIRA_API_TOKEN = "DacEfGhIjKlmNoPQRsTuVwXyZ0123456789";

    // Sentry Auth Token
    public static final String SENTRY_AUTH_TOKEN = "f0ec12ab34cd56ef7890gh12ij34kl56";

    // Trello API Key and Token
    public static final String TRELLO_API_KEY = "12345abcdef67890abcdef12345";
    public static final String TRELLO_TOKEN = "abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890";

    // Kubernetes Service Account Token
    public static final String KUBERNETES_SERVICE_ACCOUNT_TOKEN = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJrdWJlcm5ldGVzL3NlcnZpY2VhY2NvdW50";

    // Spotify Access Token
    public static final String SPOTIFY_ACCESS_TOKEN = "BQCtqXJxcW4sUE4WZARFvZ2l3d4cYYfPfWwZ9E4f3AbCdefGHijkLmNOPQRsTUVWXYZ";

    // Zoom JWT Token
    public static final String ZOOM_JWT_TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJAbExaRnpkR2x0YmpFd01IZzROekExTmpnNE5qWXpNek13";

    // Datadog API Key
    public static final String DATADOG_API_KEY = "abc123d4e5f6789a0b1c2d3e4f5g6h7i";

    // Firebase Custom Token
    public static final String FIREBASE_CUSTOM_TOKEN = "eyJhbGciOiJSUzI1NiIsImtpZCI6IjFlOWQzZTkzZTFmMjY5MWNiY2U2Y2FiYTNkZGI0MTFmNDJiYmRhOTQifQ";

    // QuickBooks Access Token
    public static final String QUICKBOOKS_ACCESS_TOKEN = "lvprdEmVAREf81234567sRg9ZfAabBcdEfGHIJKLMnopQrSt";


    @Override
    public Response sayHello() {
        String responseText = "Hello, World!";
        return Response
                .status(Response.Status.OK)
                .type(MediaType.TEXT_HTML)
                .entity(responseText)
                .build();
    }

}
