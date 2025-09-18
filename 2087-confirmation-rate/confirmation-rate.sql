select Signups.user_id, coalesce(round(avg(action='confirmed'),2),0) as confirmation_rate
from Signups left join Confirmations on Signups.user_id = Confirmations.user_id 
group by Signups.user_id