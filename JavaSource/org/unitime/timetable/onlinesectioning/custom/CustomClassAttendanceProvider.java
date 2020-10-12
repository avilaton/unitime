/*
 * Licensed to The Apereo Foundation under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * The Apereo Foundation licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
*/
package org.unitime.timetable.onlinesectioning.custom;

import org.unitime.timetable.gwt.shared.EventInterface;
import org.unitime.timetable.model.Student;
import org.unitime.timetable.onlinesectioning.OnlineSectioningHelper;
import org.unitime.timetable.security.SessionContext;

/**
 * @author Tomas Muller
 */
public interface CustomClassAttendanceProvider {
	
	public StudentClassAttendance getCustomClassAttendanceForStudent(Student student, OnlineSectioningHelper helper, SessionContext context);
	
	public InstructorClassAttendance getCustomClassAttendanceForInstructor(String externalUniqueId, Long sessionId, OnlineSectioningHelper helper, SessionContext context);

	public interface StudentClassAttendance {
		public String getClassNote(String externalId);
		public void updateAttendance(EventInterface classEvent);
	}
	
	public interface InstructorClassAttendance {
		public void updateAttendance(EventInterface classEvent);
	}
}
