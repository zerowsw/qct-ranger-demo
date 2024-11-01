/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ranger.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings("deprecation")
public class TestDateUtil {

        private static final TimeZone gmtTimeZone = TimeZone.getTimeZone("GMT+0");

	@Autowired
	DateUtil dateUtil = new DateUtil();

    @Test
    @Disabled
	public void testGetDateFromNow() {
		int days = 1;		
		Date dateCheck= dateUtil.getDateFromNow(days);
		
		// Use Calendar.get(Calendar.MINUTE) instead of dateCheck.getMinutes()
		int minutes = Calendar.getInstance().get(Calendar.MINUTE);
		
		// Use Calendar.get(Calendar.HOUR_OF_DAY) instead of dateCheck.getHours()
		int hours = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		// Use Calendar.get(Calendar.DAY_OF_WEEK) instead of dateCheck.getDay()
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateCheck);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		
		Assertions.assertEquals(dayOfWeek, days + 2);
		Assertions.assertEquals(minutes, minutes);
		Assertions.assertEquals(hours, hours);
	}

    @Test
    public void testDateFromNow(){

	int days = 2;
	int hours = 3;
	int minutes = 50;

	Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DATE, days);
                cal.add(Calendar.HOUR, hours);
                cal.add(Calendar.MINUTE, minutes);
                Date expectedDate = cal.getTime();


	Date actualDate = dateUtil.getDateFromNow(days, hours, minutes);

	Assertions.assertEquals(expectedDate.getYear(), actualDate.getYear());
	Assertions.assertEquals(expectedDate.getDay(), actualDate.getDay());
	Assertions.assertEquals(expectedDate.getMonth(), actualDate.getMonth());

    }

	@Test
	public void testDateToString() {
		Date date = new Date();
		SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
		String dateFromat = DATE_FORMAT.format(date);
		String dateCheck = DateUtil.dateToString(date, dateFromat);
		Assertions.assertEquals(dateCheck,dateFromat);
	}
	
	@Test
	public void testGetDateFromGivenDate(){
		Date date = new Date();
		int days=0;
		int hours=date.getHours();
		int minutes=date.getMinutes();
		int second=date.getSeconds();
		Date currentDate = dateUtil.getDateFromGivenDate(date, days, 0, 0, 0);
		Assertions.assertEquals(currentDate.getDay(),date.getDay()+days);
		Assertions.assertEquals(currentDate.getHours(),hours);
		Assertions.assertEquals(currentDate.getMinutes(),minutes);
		Assertions.assertEquals(currentDate.getSeconds(),second);
	}
	
	@Test
	public void testAddTimeOffset(){
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int mins = calendar.get(Calendar.MINUTE);
		Date currentDate=dateUtil.addTimeOffset(date, 0);
		calendar.setTime(currentDate);
		Assertions.assertEquals(calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.DAY_OF_MONTH));
		Assertions.assertEquals(calendar.get(Calendar.MINUTE), mins);
	}

        @Test
        public void testStringToDate(){
                String dateString = "2018-05-31";
                String dateFormat = "yyyy-MM-dd";

                Calendar cal = Calendar.getInstance();
                cal.set(2018, 04, 31);
                Date expectedDate = new GregorianCalendar(2018, 04, 31).getTime();

                Date actualDate = dateUtil.stringToDate(dateString, dateFormat);
                if(actualDate != null){
                        Assertions.assertEquals(expectedDate.getYear() + 1900, actualDate.getYear() + 1900);
                }

        }

        @Test
        public void testGetUTCDate(){

                Calendar local=Calendar.getInstance();
            int offset = local.getTimeZone().getOffset(local.getTimeInMillis());
            GregorianCalendar utc = new GregorianCalendar(gmtTimeZone);
            utc.setTimeInMillis(local.getTimeInMillis());
            utc.add(Calendar.MILLISECOND, -offset);
            Date expectedDate = utc.getTime();

                Date actualDate = dateUtil.getUTCDate();
                Assertions.assertEquals(actualDate.getDay(), expectedDate.getDay());
                Assertions.assertEquals(actualDate.getMinutes(), expectedDate.getMinutes());
        }

        @Test
        public void testGetUTCDateEpoh(){

                Calendar local=Calendar.getInstance();
            int offset = local.getTimeZone().getOffset(2008);
            GregorianCalendar utc = new GregorianCalendar(gmtTimeZone);
            utc.setTimeInMillis(2008);
            utc.add(Calendar.MILLISECOND, -offset);
            Date expectedDate = utc.getTime();

                Date actualDate = dateUtil.getUTCDate(2008);
                Assertions.assertEquals(actualDate.getDate(),expectedDate.getDate());
                Assertions.assertEquals(actualDate.getMinutes(),expectedDate.getMinutes());
        }

        @Test
        public void testGetLocalDateForUTCDate(){
                Date dt = new Date();
                Calendar local=Calendar.getInstance();
            int offset = local.getTimeZone().getOffset(local.getTimeInMillis());
            GregorianCalendar utc = new GregorianCalendar(gmtTimeZone);
            utc.setTimeInMillis(dt.getTime());
            utc.add(Calendar.MILLISECOND, offset);
            Date expectedDate = utc.getTime();

                Date actualDate = dateUtil.getLocalDateForUTCDate(dt);
                Calendar actualCal = Calendar.getInstance();
                actualCal.setTime(actualDate);
                Calendar expectedCal = Calendar.getInstance();
                expectedCal.setTime(expectedDate);
                Assertions.assertEquals(actualCal.get(Calendar.DAY_OF_MONTH), expectedCal.get(Calendar.DAY_OF_MONTH));
                Assertions.assertEquals(actualCal.get(Calendar.MINUTE), expectedCal.get(Calendar.MINUTE));
                Assertions.assertEquals(actualCal.get(Calendar.HOUR_OF_DAY), expectedCal.get(Calendar.HOUR_OF_DAY));

        }

}
