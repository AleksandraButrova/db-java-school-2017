package com.db.RadioAlarm;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.Delegate;

@AllArgsConstructor
@NoArgsConstructor
public class RadioAlarm implements Radio, Alarm{
    @Delegate
    private Radio radio = new RadioImpl();
    @Delegate
    private Alarm alarm = new AlarmImpl();
}
