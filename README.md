# Jenkins/autosetup Demo

Demo Repository for the Jenkins/autosetup container.

Currently there seems to be no other way to set up a Jenkins configuration just using the API. Therefore the Jenkins/autosetup allows to set a repository URL using the `AUTOSETUP` environment variable while starting the container.

The repository contains the configuration files as they are in `$JENKINS_HOME` (You only need to include the ones where your changes reside)

To run the configuration from this repository use:

		docker run -dp 8080:8080 -e AUTOSETUP="https://github.com/i-net-software/jenkins-autosetup-demo.git" inetsoftware/jenkins-autosetup
		
`AUTOSETUP` can take a spaces separated list of svn and git repositories and uses the `plugins.txt` ([see](https://github.com/jenkinsci/docker#installing-more-tools)) as well as `.groovy` and `.xml` files from the config folder.

This setup uses the approach of [fabric8io/jenkins-docker](https://github.com/fabric8io/jenkins-docker) to also patch the environment variables set in the `*.xml` configuration files.

**Beware:** the setup is executed everytime a container (re-)starts. The benefit of this is that changes on your repository URLs will be reflected with the next launch.
