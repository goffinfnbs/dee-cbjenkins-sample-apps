@Library("dee-cbjenkins-shared-libs@v9.0.0") _


buildMavenPipeline(
    
    artifactId: "dee-cbjenkins-sample-apps", // need to update for different microservices
    artifactoryUser: "svcCBJInt_CICD",
    artifactoryIdentityTokenId: "cbj_art_identity_token", 
    artifactoryMavenRepo: "cicd-maven-dev/helloworld-java", 
    artifactoryDockerRepoBase: "cicd-docker", 
    artifactoryDockerRepo: "cicd-docker-dev-local", 
    githubPat: "cbj_github_pat", 
    snykOrg: "645f1fb7-8550-4d24-ad5b-9deee085d645", 
    snykTokenId: "cbj_snyk_api_key",
    sonarProjectKeyPre: "cicd.", 
    helmPublishRepo: "cicd-helm-dev-local",

    // skipHelmPackage: true,
    // skipCheckStyle: true,
    // skipSnyk: true,
    // skipSonar: true,
    // skipFortify: true,
    // skipXrayScan: true,
    // skipHarness: true,
    // skipTeamsAlerts: true,

    // Other parameters
    mainBranch: "master",
    kubernetesCloud: "ci",
    imageBuildKubernetesCloud: "ci-kaniko",
    sonarInstallation: "sonarqube",
    
    harnessApiKeyId: 'harness_webhook_api_prod',
    harnessWebhookId: '12dlmCn6NgJGupKvZ97B0UaV8yiwd9QhJGpxXP1I',
    harnessAccountId: 'TSw91wglQiKwCocRRpn5xA',
    harnessApplicationId: 'fHPJQyJgRjOmJv75_rVLqQ',
    harnessArtifactoryRepoKey: 'cicd',
    harnessArtifactoryRepoType: 'docker',
                            
)

