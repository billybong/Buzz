/*
 * Buzz - a monitoring framework for JBoss
 *
 * Copyright 2012 Anders Welén, anders@welen.net
 * 
 * This file is part of Buzz.
 *
 * Buzz is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * Buzz is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Buzz.  If not, see <http://www.gnu.org/licenses/>. 
 */
package net.welen.buzz.protocols.mail;

import net.welen.buzz.protocols.BuzzAnswer;

import org.apache.log4j.Logger;

/**
 * Java structure of the Mail protocol
 * 
 * @author welle
 */
public class MailAnswer extends BuzzAnswer {

	private static final Logger LOG = Logger.getLogger(MailAnswer.class);			
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer mailBody = new StringBuffer("Buzz mail report.\nFollowing measurements triggered a warning or error on server: %serverId%:\n");
		mailBody.append(super.toString());
		
		if (LOG.isDebugEnabled()) {
			LOG.debug("Mailbody:\n" + mailBody);
		}
		return mailBody.toString();
	}

}
