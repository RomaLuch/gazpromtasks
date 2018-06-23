package solution4;

public class Solution {
    /*Задание:
    У сущности Роль есть атрибуты  «Компания», «Система», «Тип роли», каждый из которых может принимать
    только одно значение из большого справочника. Необходимо сформулировать функциональные требования к
    следующим пользовательским требованиям: «Нужен интерфейс поиска ролей с фильтрами-выпадающими списками:
    Система, Компания, Тип роли. При выборе значения в одном из фильтров, в других фильтрах должны динамически
    сужаться перечни возможных значений».

Решение:
Никогда раньше не писал функционльные требования - поэтому заранее извеняюсь - если ниже будет полный бред

Функциональные требования:
1) Необходима БД - с таблицей Роль с четырьмя столбцами ID, Система, Компания, Тип Роли
2) Столбцы Система, Компания, Тип Роли - ссылаются на соответствующие таблицы
3) 2 слоя приложения DAO и Controller
4) В контролере будет 3 метода getAllSystems, getAllCompanies, getAllTypesOfRoles;
 4.1 Первый с одним атрибутом Long systemId
 4.2 Второй с двумя атрибутами Long systemId, Long companyId;
 4.3 Третий с трмя атрибутами Long systemId, Long companyId, Long typeOfRoleId
5) слой Dao будет иметь соответствующие методы и доставть из базы нужные данные и отправлять их на слой Controller


     */
}
