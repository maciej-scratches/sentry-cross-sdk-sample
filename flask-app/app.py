import sentry_sdk
from sentry_sdk.integrations.flask import FlaskIntegration
from flask import Flask
from urllib.request import urlopen

sentry_sdk.init(
    integrations=[FlaskIntegration()],
    traces_sample_rate=1.0,
    debug=True
)

app = Flask(__name__)

@app.route("/")
def hello_world():
  with urlopen("http://java-app:8080/hello") as response:
    response_content = response.read()
    return response_content
