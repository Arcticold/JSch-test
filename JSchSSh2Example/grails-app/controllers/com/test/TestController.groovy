package com.test
import com.jcraft.jsch.JSchException
import com.toastcoders.jschssh.RunSshCommand
import com.toastcoders.jschssh.ScpFileTo
import com.toastcoders.jschssh.ScpFileFrom

class TestController {

	

    def index() {

        try 
		{
            new ScpFileTo().execute() {
                host = ""
                username = ""
                password = ""
                localFile = ""
                remoteFile = ""
                strictHostKeyChecking = "yes"
            }
        }
        catch (JSchException e) {
            log.trace("Oh noes!!", e)
            render "There was an error placing file on host. ${e.message}<br />"
        }
		/*
        render new RunSshCommand().execute() {
            host = ""
            username = ""
            password = ""
            command = "cat "
            strictHostKeyChecking = "yes"
        }
		
        try 
		{
            new ScpFileFrom().execute() 
			{
                host = ""
				username = ""
				password = ""
                localFile = ""
                remoteFile = ""
            }
        }
        catch (JSchException je) 
		{
            log.trace("Failed to copy file from remote host to local host.")
        }
		*/
    }

}