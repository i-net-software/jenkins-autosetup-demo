import jenkins.model.*

// Disable executors on master, we will run them on "the cloud"
Jenkins.instance.setNumExecutors(0)
